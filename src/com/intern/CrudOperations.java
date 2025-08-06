package com.intern;
import java.util.*;
public class CrudOperations {
	
		List<Student> l = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		public void add(int id, String name, int marks) {

			Student s = new Student();
			s.setId(id);
			s.setName(name);
			s.setMarks(marks);
			l.add(s);
			System.out.println("Student added sucessfully");
		}

		public void view() {
			System.out.println(l.toString());
		}

		public void delete(int id) {

			for (int i = 0; i < l.size(); i++) {
				if (l.get(i).getId() == id) {
					l.remove(i);
				}
			}
			System.out.println("Student deleted sucessfully...");
		}

		public void update(int id, String field, String newValue) {

			for (Student s : l) {
				if (s.getId() == id) {
					switch (field.toLowerCase()) {
					case "name":
						s.setName(newValue);
						System.out.println("Name updated successfully.");
						return;
					case "marks":
						try {
							int marks = Integer.parseInt(newValue);
							s.setMarks(marks);
							System.out.println("Marks updated successfully.");
						} catch (NumberFormatException e) {
							System.out.println("Marks should be an integer.");
						}
						return;
					default:
						System.out.println("Invalid field. Use 'name' or 'marks'.");
						return;
					}
				}
			}
		}
	}
