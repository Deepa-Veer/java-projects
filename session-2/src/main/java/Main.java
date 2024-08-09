class Main{

    public static void main(String [] args){

        System.out.println("Hello");
        User user1=new User();
        System.out.println(user1.name+";"+user1.age+";"+ user1.gender);// null;0;null
        user1.name="Priya";
        user1.age=29;
        user1.gender="Female";
        System.out.println(user1.name+";"+user1.age+";"+ user1.gender);// Priya;29;Female
        User user2=new User();
        System.out.println(user2.name+";"+user2.age+";"+ user2.gender);//null;0;null
        user2.name="Diya";
        user2.age=30;
        user2.gender="Female";
        System.out.println(user2.name+";"+user2.age+";"+ user2.gender);//Diya;30;Female
        User user3= new User();
        System.out.println(user3.name+";"+user3.age+";"+ user3.gender);//null;0;null
        user3.name="Veeren";
        user3.age=31;
        user3.gender="Male";
        System.out.println(user3.name+";"+user3.age+";"+ user3.gender);//Veere;31;Male



    }
}