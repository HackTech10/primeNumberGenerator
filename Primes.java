public class Primes {
    public static void main(String[] args) {
        //max int number is 2147483647
        int count = 9999;
        for(int i = 0; i <= count; i++){
            int prime = 0;
            for(int j = 0; j < i; j++){
                if((j!=0) && (j!=1)){
                    if(i % j != 0){
                        prime++;
                    }
                    else{break;} //massive performance boost
                }
            }
            if(prime == i-2){
                System.out.println(i);
            }
        }
    }
}