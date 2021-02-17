public class Objeeect
{
    public int confidential_level;
    private static int idCnt = 1;
    protected int id = idCnt++;

    @Override
    public String toString()
    {
        return "Objeeect" + " id" + id  + "["+confidential_level+"]";
    }
}