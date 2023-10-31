class Election{
    public static void main(String[] args){
           int age=14;
           if(age==16 && age==18){
            System.out.println("Eligible to vote");
           }
         if(age<=15){
            System.out.println("Not Eligible to vote");
          }
         if(age>=18){
           System.out.println("Not Eligible for voting"); 
         }
     }
}