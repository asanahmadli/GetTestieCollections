package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable {
    @Test
    public void comporableAge(){
        Student student1 = new Student("john",29);
        Student student2 = new Student("cek",29);

        int expected = 1;
        int actual  = student1.compareTo(student2);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void comporableName(){
        Student student1 = new Student("john",29);
        Student student2 = new Student("john",28);

        int expected = 1;
        int actual  = student1.compareTo(student2);
        Assert.assertEquals(expected,actual);

    }

}
