import java.util.Objects;

public class MyTestingClass {
    private int attribute1;
    private int attribute2;
    public MyTestingClass(int attribute1, int attribute2){
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    @Override
    public int hashCode() {
        int result = attribute1;
        result = 31 * result + attribute2;
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return attribute1 == that.attribute1 && attribute2 == that.attribute2;
    }
}
