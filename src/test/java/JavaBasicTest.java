import com.umbra.javaBasic.Singleton;
import org.junit.Test;

public class JavaBasicTest {

    @Test
    public void testStatic() throws Exception{
        Singleton s0 = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.format("s0 内存地址：%s\n", s0);
        System.out.format("s1 内存地址：%s\n", s1);
        System.out.format("s2 内存地址：%s\n", s2);
        System.out.format("s0.output：%s\n", s0.getOutput());




    }
}
