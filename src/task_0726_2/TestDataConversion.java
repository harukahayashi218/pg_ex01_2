package task_0726_2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class TestDataConversion {

	private ByteArrayOutputStream byteArrayOutputStream;

	@Before
	public void setUp() {
		byteArrayOutputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(new BufferedOutputStream(byteArrayOutputStream)));
	}

	@Test
	public void testExcluded() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\n変換できません。\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testOne() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nI\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testThree() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nIII\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testFour() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nIV\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testFive() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nV\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testSeven() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nVII\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testNine() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nIX\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testTen() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nX\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testTwelve() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nXII\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testFourteen() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nXIV\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testFifteen() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nXV\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testSeventeen() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nXVII\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testNineteen() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nXIX\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

	@Test
	public void testTwenty() {
		DataConversion.main(new String[]{});

		System.out.flush();
		assertThat(byteArrayOutputStream.toString(),
				is("数字を入力してください。\r\nXX\r\n完了しました。\r\n処理を終了します。\r\n"));
	}

}
