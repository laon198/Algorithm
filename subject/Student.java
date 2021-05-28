package subject;

public class Student implements Comparable<Student>{

		int korean; 			//r1
		int math;				//r2
		int english;			//r3
		int science;			//r4
		int data_structured;	//r5
		
		public Student(int korean,int math,int english,int science,int ds) {
			this.korean = korean;
			this.math = math;
			this.english = english;
			this.science = science;
			data_structured = ds;
		}
		
		public double getAvg() {return (double)( korean + math + english + science + data_structured)/5;}

		@Override
		public int compareTo(Student s) {
			if(s.getAvg() > this.getAvg()) return -1;
			else if(s.getAvg() < this.getAvg()) return 1;
			else return 0;
		}
}
