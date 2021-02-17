public class Model
{
    public static void write(Objeeect objeeect, Subject subject)
    {
        if (subject.access_level <= objeeect.confidential_level)
        {
            System.out.println("Сейчас произойдет понижение уровня конфиденциальности объекта " + objeeect.toString() );
            //objeeect.confidential_level = subject.access_level;
            System.out.print("Объекту " + objeeect.toString() );
            System.out.println(" присвоен уровень доступа субъекта " + subject.toString() + " " + subject.access_level );
            //objeeect.toString();
            objeeect.confidential_level = subject.access_level;
            clear(objeeect);
        }
    }

    private static void clear(Objeeect objeeect)
    {
        System.out.println("Объект " + objeeect.toString() +  " очищен" );
    }


    public static void read(Objeeect objeeect, Subject subject)
    {
        if (subject.access_level >= objeeect.confidential_level)
        {
            System.out.println("Объект " + objeeect.toString() + " прочитан субъектом " + subject.toString());
        }
    }

    public static void reset(Objeeect objeeect, Subject subject)
    {
        if (subject.access_level > objeeect.confidential_level)
        {
            objeeect.confidential_level =+100;
            System.out.println("Объекту " + objeeect.toString()+ "присвоен максимальный уровень=" + objeeect.confidential_level);
        }
    }
}