public class Test {
    public static void main(String[]args){


        /*Animal[] animals=new Animal[3];
        animals[0]=new Cat();
        animals[1]=new Dog();
        animals[2]=new Lion();
        for (int i=0;i<=animals.length-1;i++){
            animals[i].sound();
        }*/
       Animal[] animals={new Cat(),new Dog(),new Lion()};
        for (Animal animal:animals){
            animal.sound();
        }




    }
}