package exception;

public class TryCatchTest {

	public static void main(String[] args) {
		System.out.println(">>> 프로그램 시작");
		String[] array = { "100", "2oo", "400" };

		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.printf("array[%d]의 값은 %d입니다. \n", i, value);
			} catch (NumberFormatException e) {
				System.out.println("숫자로 바꿀 수 없는 문자열 입니다.");
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("인덱스 범위를 초과하였습니다.");
			}catch(Exception e) {
//				System.out.println("인덱스 범위를 초과하였습니다.");
//				e.printStackTrace();
				System.out.println(e.toString());
			}
		}

		System.out.println(">>>> 프로그램 끝");
	}

}
