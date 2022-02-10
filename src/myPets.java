public class myPets
{
    //1 Instance variables
        public boolean isFriendly;
        public String foodType;
        public double amtSleep;
        public String name;
        public int age;

    //2 Constructors
        public myPets(boolean isFriendly, String foodType, double amtSleep, String name, int age)
        {
            this.isFriendly = isFriendly;
            this.foodType = foodType;
            this.amtSleep = amtSleep;
            this.name = name;
            this.age = age;
        }

    //4 Getters
    public boolean getIsFriendly()
    {
        return isFriendly;
    }
    public String getFoodType()
    {
        return foodType;
    }
    public double getAmtSleep()
    {
        return amtSleep;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    //5 Setters
    public void setIsFriendly(boolean friendly)
    {
        isFriendly = friendly;
    }
    public void setFoodType(String foodType)
    {
        this.foodType = foodType;
    }
    public void setAmtSleep(double amtSleep)
    {
        this.amtSleep = amtSleep;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge()
    {
        this.age = age;
    }

    //6 Brain Methods
        public int sleepInSeconds()
        {
            return (int)(amtSleep*3600);
        }
        public int monthlyFeedings()
        {
            return 30;
        }
    //3 toString
        public String toString()
        {
            String output = "Name: " + name +
                    "\nAge: " + age +
                    "\nFriendly: " + isFriendly +
                    "\nhours of sleep: " + amtSleep +
                    "\nfoodType: " + foodType;
            return output;
        }

}
