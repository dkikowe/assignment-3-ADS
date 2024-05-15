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
        int result = 17;
        result = 31 * result + attribute1;
        result = 31 * result + attribute2;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return attribute1 == other.attribute1 && attribute2 == other.attribute2;
    }
}
