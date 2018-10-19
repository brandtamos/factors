public class Factors {
    public static void main(String[] args){
        int param1 = Integer.parseInt(args[0]);
        int param2 = Integer.parseInt(args[1]);

        //I'm not sure if 1 is technically a factor of every number infinite times or just one,
        //but either way we're going to treat it like an edge case that we won't deal with
        if(param2 <= 1 && param2 >= -1){
            System.out.println("The second parameter must not be -1, 0, or 1.");
        }
        else{
            System.out.println(getFactorNumber(param1, param2));
        }
        
    }

    //recursive calls because I love stressing the call stack!
    private static int getFactorNumber(int param1, int param2){
        if(param1 % param2 == 0) return 1 + getFactorNumber(param1 / param2, param2);
        return 0;
    }

}