public class Hamster extends myPets
{
    //1 Instance variables
        private boolean needToEx;//Do I need to exercise it
        private boolean needsGrooming;//long hair vs short hair

    //2 Constructors
        public Hamster(boolean needToEx, boolean needsGrooming, boolean isFriendly
                , String foodType, double amtSleep, String name, int age)
        {
            super(isFriendly, foodType, amtSleep, name, age);
            this.needToEx = needToEx;
            this.needsGrooming = needsGrooming;
        }
    //4 Getters
    public boolean isNeedToEx()
    {
        return needToEx;
    }
    public boolean isNeedsGrooming()
    {
        return needsGrooming;
    }

    //5 Setters
    public void setNeedToEx(boolean needToEx)
    {
        this.needToEx = needToEx;
    }
    public void setNeedsGrooming(boolean needsGrooming)
    {
        this.needsGrooming = needsGrooming;
    }

    //3 toString
        public String toString()
        {
            String output = super.toString() +
            "\nNeeds To Be Excercised: " + needToEx +
            "\nNeeds To Be Groomed: " + needsGrooming;
            return output;
        }
}
