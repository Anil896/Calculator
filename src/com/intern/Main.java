package com.intern;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		CrudOperations oc = new CrudOperations();

		if (args.length == 0) {
			System.out.println("No command provided. Give any one of these: add, view, update, delete");
			return;
		}

		String command = args[0];

		switch (command.toLowerCase()) {

		case "add":
			if (args.length != 4) {
				System.out.println("Give command like this: add id name marks");
			} else {
				int id = Integer.parseInt(args[1]);
				String name = args[2];
				int marks = Integer.parseInt(args[3]);
				oc.add(id, name, marks);
			}
			break;

		case "view":
			oc.view();
			;
			break;

		case "update":
			if (args.length != 4) {
				System.out.println("Give command like this: update id feild newValue");
			} else {
				int id = Integer.parseInt(args[1]);
				String field = args[2];
				String newValue = args[3];
				oc.update(id, field, newValue);
			}
			break;

		case "delete":
			if (args.length != 2) {
				System.out.println("Give command like this: delete id");
			} else {
				int id = Integer.parseInt(args[1]);
				oc.delete(id);
			}

		default:
			System.out.println("Invalid command, please try: add, view, update, delete");
			break;
		}
	}

}
