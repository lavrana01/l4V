import org.junit.Assert;
import org.junit.Test;

public class HelloWorld {
    public String helloWorld() {
        return "Hello World";
    }



    


    @Test
    public void testHelloWorld() {
        HelloWorld hw = new HelloWorld();
        Assert.assertEquals("It doesn't return 'Hello World'", 
            "Hello World", hw.helloWorld());
    }


}