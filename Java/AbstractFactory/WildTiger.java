//Types of Tigers-wild tigers and pet tigers
class WildTiger implements Tiger
{
      @Override
      public void speak()
      {
            System.out.println("Wild Tiger says loudly: Halum.");
      }
      @Override
      public void preferredAction()
      {
            System.out.println("Wild Tigers prefer hunting in jungles.\n");
      }
}