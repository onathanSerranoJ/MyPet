public class myPets
{
    //1 Instance variables
        public boolean isFriendly;
        public String foodType;
        public double amtSleep;
        public String name;

    //2 Constructors
        public myPets(boolean isFriendly, String foodType, double amtSleep, String name)
        {
            this.isFriendly = isFriendly;
            this.foodType = foodType;
            this.amtSleep = amtSleep;
            this.name = name;
        }

    //3 toString
        public String toString()
        {
            String output = "Name: " + name +
                    "\nFreindly: " + isFriendly +
                    "\nhours of sleep: " + amtSleep +
                    "\nfoodType: " + foodType;
            return output;
        }
}
