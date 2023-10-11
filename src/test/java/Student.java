import lombok.*;

import java.io.File;
import java.io.FileInputStream;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder



public class Student{
    private String name;
    private int rollNumber;
}


class DemoLombok {
    @SneakyThrows
    public static void main(String[] args) {
       Student s = new Student();
       Student s1 = Student.builder().name("Adnan").rollNumber(101).build();
        Student s2 = new Student();

    }
}
