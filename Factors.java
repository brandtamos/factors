public class Factors {
    public static void main(String[] args){
        int param1 = 0;
        int param2 = 0;
        try{
            param1 = Integer.parseInt(args[0]);
            param2 = Integer.parseInt(args[1]);
        }
        catch(NumberFormatException e){
            System.out.println("Unable to parse paramter as an integer");
            System.out.println(e.getMessage());
            System.exit(0);
        }

        if(param1 == 0){
            System.out.println("The first parameter must not be 0.");
        }
        //I'm not sure if 1 is technically a factor of every number infinite times or just one,
        //but either way we're going to treat it like an edge case that we won't deal with
        else if(param2 <= 1 && param2 >= -1){
            System.out.println("The second parameter must not be -1, 0, or 1.");
        }
        else{
            int result = getFactorNumber(param1, param2);
            //if result meets our sign condition, adjust the result to correct
            if(
                result > 0 && 
                specialSignCondition(param1, param2) &&
                result % 2 == 1
                ){
                    result--;
                } 
                
            System.out.println(result);
        }
        
    }

    //recursive calls because I love stressing the call stack!
    private static int getFactorNumber(int param1, int param2){
        if(param1 % param2 == 0) return 1 + getFactorNumber(param1 / param2, param2);
        return 0;
    }

    private static boolean specialSignCondition(int param1, int param2){
        return param1 > 0 && param2 < 0;
    }
}