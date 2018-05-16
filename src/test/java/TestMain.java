import com.example.entity.Student;
import com.example.service.StudentService;
import com.jeff.tianti.common.entity.MysqlSequenceIdEntity;
import com.jeff.tianti.common.util.GenCodeUtil;
import org.junit.Test;

import java.io.IOException;

public class TestMain {


    public static void main(String[] args) {
        String p = "com.example";
        String w = "liu";
        Class c = Student.class;
        createDto(c, p, w);
        createDao(c, p, w);
        createService(c, p, w);
        MysqlSequenceIdEntity mysqlSequenceIdEntity=new MysqlSequenceIdEntity();
    }

    static void createDao(Class c, String p, String w) {
        try {
            GenCodeUtil.createDaoClass(c, p, w);
            GenCodeUtil.createDaoCustomInterface(c, p, w);
            GenCodeUtil.createDaoInterface(c, p, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createDto(Class c, String p, String w) {
        try {
            GenCodeUtil.createFrontQueryDTO(c, p, w);
            GenCodeUtil.createQueryDTO(c, p, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createService(Class c, String p, String w) {
        try {
            GenCodeUtil.createServiceClass(c, p, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
