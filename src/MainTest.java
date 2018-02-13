/**
 * Created by rashverm on 10/6/2016.
 */
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
public class MainTest {
    public static void main(String[] args) {
        List<Task> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Task(i, "Test1", "Test2", Task.Status.ASSIGNED, 10));
        }
        Gson gson = new Gson();
        String json = gson.toJson(list);
        System.out.println(json);

    }
}
