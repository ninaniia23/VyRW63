package vti.com.backend;

import java.util.ArrayList;
import java.util.Scanner;

import vti.com.entity.News;
import vti.com.entity.TuyenSinh;

public class Excercise1Java {

	Scanner scanner = new Scanner(System.in);
	ArrayList<News> listNews = new ArrayList<News>();
	TuyenSinh tuyenSinh = new TuyenSinh();

	// Tạo ra 1 menu để chọn bài tập cần làm
	// Question 1
	public void Question1() {
		loadMenu();
	}

	private void loadMenu() {
		while (true) {
			System.out.println("=======================================================================");
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
			System.out.println("===              1. Insert news.                                    ===");
			System.out.println("===              2. View list news.                                 ===");
			System.out.println("===              3. Average rate .                                  ===");
			System.out.println("===              4. Exit.                                           ===");
			System.out.println("=======================================================================");
			int menuChoose = scanner.nextInt();
			switch (menuChoose) {
			case 1:
				System.out.println("Nhập vào Title");
				String title = scanner.next();
				System.out.println("Nhập vào PublishDate");
				String publishDate = scanner.next();
				System.out.println("Nhập vào Author");
				String author = scanner.next();
				System.out.println("Nhập vào Content");
				String content = scanner.next();

				System.out.println("Nhập vào đánh giá 1");
				int rate1 = scanner.nextInt();
				System.out.println("Nhập vào đánh giá 2");
				int rate2 = scanner.nextInt();
				System.out.println("Nhập vào đánh giá 3");
				int rate3 = scanner.nextInt();
				int[] rates = { rate1, rate2, rate3 };

				News news = new News(1, title, publishDate, author, content, rates);
				// News news2 = new News(title, publishDate, author, content, null, rates);
				// News news = new News(id, title, publishDate, author, content, rates);
				listNews.add(news);
				break;

			case 2:
				for (News news1 : listNews) {
					news1.Display();
				}
				break;
			case 3:
				System.out.println("Đánh giá trung bình Rate");
				for (News news1 : listNews) {

					System.out.println("Title: " + news1.getTitle() + " averageRate: " + news1.Calculate());
				}
				break;
			case 4:
				return;

			default:
				System.out.println("Alarm: Lựa chọn đúng số trên menu");
				break;
			}
		}

	}

	public void Question2() {

		loadMenu2();
	}

	public void loadMenu2() {
		while (true) {
			System.out.println("=======================================================================");
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
			System.out.println("===              1. Insert contestant.                              ===");
			System.out.println("===              2. View list contestants.                          ===");
			System.out.println("===              3. Search by ID Number .                           ===");
			System.out.println("===              4. Exit.                                           ===");
			System.out.println("=======================================================================");
			int menuChoose2 = scanner.nextInt();
			switch (menuChoose2) {
			case 1: {
				tuyenSinh.addContestant();
				break;

			}
			case 2: {

				tuyenSinh.viewListContestant();
				break;
			}
			case 3: {
				int idNum = scanner.nextInt();
				tuyenSinh.searchbyIDNum(idNum);

				break;
			}
			case 4:
				return;
			default: {
				System.out.println("Alarm: Bạn nhập vào không đúng");
				break;
			}

			}
		}
	}
}
