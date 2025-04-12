package JavaFinalProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PartsManager {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<PartsData> parts = new ArrayList<>();

		// 변수선언
		boolean stopFlag = false;

		// 메뉴선택
		while (!stopFlag) {
			// 메뉴화면
			menuDisplay();
			int num = 0;
			num = menuSelect();
			switch (num) {
			case 1:
				System.out.println("재고 조회");
				System.out.printf("부품명\t수량\t입고일자\n");
				System.out.printf("%s\n", parts.toString());
				break;
			case 2:
			{
				int partsInQty = 0;
				String partsInDate = "";
				/* 임시생성 */ String partsName = "";
				boolean stopPartsIn = false;

				while (!stopPartsIn) {
					partsMenuDisplay();
					int partsInNum = 0;
					partsInNum = partsMenuSelect();
					switch (partsInNum) {
					case 1:
						partsName = "램";
						break;
					case 2:
						partsName = "CPU";
						break;
					case 3:
						partsName = "메인보드";
						break;
					case 4:
						partsName = "그래픽카드";
						break;
					case 5:
						partsName = "파워";
						break;
					case 6:
						partsName = "케이스";
						break;
					case 7:
						partsName = "모니터";
						break;
					case 8:
						partsName = "키보드";
						break;
					case 9:
						partsName = "마우스";
						break;
					case 10:
						System.out.println("부품 입고 종료");
						stopPartsIn = true;
						break;
					}

					if (!partsName.isEmpty() && partsInNum != 10) {
						System.out.println("부품 개수 : ");
						partsInQty = Integer.parseInt(scan.nextLine());
						System.out.println("입고일자 : ");
						partsInDate = scan.nextLine();

						PartsData addPart = new PartsData(partsName, partsInQty, partsInDate);
						parts.add(addPart);
					}
				}
			}
				break;
			case 3:
			{
				int partsInQty = 0;
				String partsInDate = "";
				/* 임시생성 */ String partsName = "";
				boolean stopPartsOut = false;

				while (!stopPartsOut) {
					partsMenuDisplay();
					int partsOutNum = 0;
					partsOutNum = partsMenuSelect();
					switch (partsOutNum) {
					case 1:
						partsName = "램";
						break;
					case 2:
						partsName = "CPU";
						break;
					case 3:
						partsName = "메인보드";
						break;
					case 4:
						partsName = "그래픽카드";
						break;
					case 5:
						partsName = "파워";
						break;
					case 6:
						partsName = "케이스";
						break;
					case 7:
						partsName = "모니터";
						break;
					case 8:
						partsName = "키보드";
						break;
					case 9:
						partsName = "마우스";
						break;
					case 10:
						System.out.println("부품 출고 종료");
						stopPartsOut = true;
						break;
					}

					if (!partsName.isEmpty() && partsOutNum != 10) {
						System.out.println("부품 개수 : ");
						partsInQty = Integer.parseInt(scan.nextLine());
						System.out.println("출고일자 : ");
						partsInDate = scan.nextLine();

						PartsData removePart = new PartsData(partsName, partsInQty, partsInDate);
						parts.remove(removePart);
					}
				}
			}
				break;
			case 4:
				System.out.println("부품 정보 수정");

				break;
			case 5:
				System.out.println("종료");
				stopFlag = true;
				break;
			}
		}
	}

	public static int partsMenuSelect() {
		boolean inStopFlag = false;
		int partsInNum = 0;
		System.out.println("입고처리 할 부품 선택 : ");
		while (!inStopFlag) {
			partsInNum = Integer.parseInt(scan.nextLine());
			boolean isInNumCheck = Pattern.matches("^[0-9]{1,2}$", String.valueOf(partsInNum));

			if (isInNumCheck == false || partsInNum >= 11 || partsInNum <= 0) {
				System.out.println("유효한 번호를 입력해주세요 : ");
				continue;
			}
			if (isInNumCheck == true) {
				inStopFlag = true;
			}
		}
		return partsInNum;
	}

	public static int menuSelect() {
		boolean stopNumCheck = false;
		int num = 0;
		System.out.println(" - 메뉴 번호 입력 : ");
		while (!stopNumCheck) {
			num = Integer.parseInt(scan.nextLine());
			boolean isNumCheck = Pattern.matches("^[0-9]{1,2}$", String.valueOf(num));
// 예외처리 개선 필요(문자 입력 시 컴파일 에러 발생)
			if (isNumCheck == false || num == 0) {
				System.out.println("유효한 번호를 입력해주세요 : ");
				continue;
			}
			if (isNumCheck == true) {
				stopNumCheck = true;
			}
		}
		return num;
	}

	public static void menuDisplay() {
		System.out.println("┌─────　Ｍ　Ｅ　Ｎ　Ｕ　─────┐");
		System.out.println("│                          │");
		System.out.println("│  1. 재고 조회 　　　　　　   │");
		System.out.println("│  2. 부품 입고 　　　　　　   │");
		System.out.println("│  3. 부품 출고 　　　　　　   │");
		System.out.println("│  4. 부품 정보 수정           │");
		System.out.println("│  5. 종료　　　             │");
		System.out.println("└──────────────────────────┘");
	}

	public static void partsMenuDisplay() {
		System.out.println("┌────　부　품　　선　택　────┐");
		System.out.println("│ ● 부품목록　　　　　　     │");
		System.out.println("│  1.  램   　　　　　　   │");
		System.out.println("│  2.  CPU               │");
		System.out.println("│  3.  메인보드　　　　　  　│");
		System.out.println("│  4.  그래픽카드　　　      │");
		System.out.println("│  5.  파워　　　          │");
		System.out.println("│  6.  케이스              │");
		System.out.println("│  7.  모니터              │");
		System.out.println("│  8.  키보드              │");
		System.out.println("│  9.  마우스              │");
		System.out.println("│  10. 종료　　　          │");
		System.out.println("└────────────────────────┘");
	}
}