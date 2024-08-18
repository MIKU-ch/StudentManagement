package raisetech.StudentManagement;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		String original = "Hello World";
		String swapped = StringUtils.swapCase(original);
		System.out.println("通常のHello Worldの表示: " + original);
		System.out.println("大文字と小文字を変換した表示: " + swapped);
	}

}
