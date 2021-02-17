public class Subject
{
    public int access_level;
    private static int idCnt = 1;
    protected int id = idCnt++;

    @Override
    public String toString()
    {
        return "Subject" + " id" + id + "["+access_level+"]" ;
    }
}