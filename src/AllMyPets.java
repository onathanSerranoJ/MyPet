public class AllMyPets
{
    public static void main(String[]args)
    {
        myPets testPet = new myPets(false,"food",2,"Test Pet");
        System.out.println(testPet.toString() + "\n");

        Frog shrimp = new Frog(false,true,"worms",6,"Shrimp");
        System.out.println(shrimp.toString());

        Hamster jgerome = new Hamster(false,true,true
                ,"rats",0.5,"Jgerome");
        System.out.println(jgerome.toString());

    }
}
