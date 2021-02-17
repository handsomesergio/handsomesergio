import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        //Model model = new Model();

        Subject subject1 = new Subject();
        subject1.access_level = 1;

        Subject subject2 = new Subject();
        subject2.access_level = 2;

        Subject subject3 = new Subject();
        subject3.access_level = 3;

        Subject subject4 = new Subject();
        subject4.access_level = 4;

        List<Subject> subjectLinkedList = new ArrayList<>();
        subjectLinkedList.add(subject1);
        subjectLinkedList.add(subject2);
        subjectLinkedList.add(subject3);
        subjectLinkedList.add(subject4);
        System.out.println(subjectLinkedList);

        System.out.println();

        Objeeect objeeect1 = new Objeeect();
        objeeect1.confidential_level = 1;

        Objeeect objeeect2 = new Objeeect();
        objeeect2.confidential_level = 2;

        Objeeect objeeect3 = new Objeeect();
        objeeect3.confidential_level = 3;

        Objeeect objeeect4 = new Objeeect();
        objeeect4.confidential_level = 4;


        List<Objeeect> objeeectLinkedList = new ArrayList<>();
        objeeectLinkedList.add(objeeect1);
        objeeectLinkedList.add(objeeect2);
        objeeectLinkedList.add(objeeect3);
        objeeectLinkedList.add(objeeect4);

        System.out.println(objeeectLinkedList);
        System.out.println();

        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            switch (random.nextInt(3)) {
                case (0):
                    Model.write(objeeectLinkedList.get(random.nextInt(4)), subjectLinkedList.get(random.nextInt(4)));

                case (1):
                    Model.read(objeeectLinkedList.get(random.nextInt(4)), subjectLinkedList.get(random.nextInt(4)));

                case (2):
                    Model.reset(objeeectLinkedList.get(random.nextInt(4)), subjectLinkedList.get(random.nextInt(4)));
            }
        }
    }
}