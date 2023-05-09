package Java8Pgms;

import java.util.function.Function;
import java.util.function.Predicate;

public class predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <Student,String > f =s->{
			int marks = s.marks;
			String grade ="";
			if(marks>=80)
			grade = "A distinction";

			else if(marks>=60)
			grade = "B First class";

			else if(marks>=50)
			grade = "c second class";

			else if(marks>=35)
			grade = "d third class";

			else grade = "E failed";
			return grade;
			};
			
			Predicate<Student> p = s-> s.marks>=60;
			Student [] s = { new Student("Durga",100),
						new Student("bunny",65),
						new Student("sunny",55),
			new Student("chinn",45),
			new Student("vinay",25)
			};
			
			for(Student s1 : s)
			{
			if(p.test(s1)){
			System.out.println("student name" + s1.name);
			System.out.println("student marks " + s1.marks);
			System.out.println("student grade" + f.apply(s1));
			}
			}
			
			



	}

}
