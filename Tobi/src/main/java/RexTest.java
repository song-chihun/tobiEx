import java.util.regex.Pattern;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RexFactory.class);
		Rex rex = context.getBean("rex", Rex.class);
		Rex rex2 = context.getBean("rex", Rex.class);
		Rex rex3 = context.getBean("rex", Rex.class);
		
		String a = "<img src='detail.jpg' alt='상품 상세정보' longdesc='detail/product1.txt' />";
		String b = "<img src='detail2.jpg' alt='상품 상세정보' longdesc='detail/product1.txt' />";
		String c = "<img src='detail3.jpg' alt='상품 상세정보' longdesc='detail/product1.txt' />";
		
		rex.setNonValidPattern(Pattern.compile("<img(?=\\s)[^>]*\\ssrc=([\"'])([^>]*?)(\\1)[^>]*/?>"));
		//rex2.setNonValidPattern(Pattern.compile("<img(?=\\s)[^>]*\\ssrc=([\"'])([^>]*?)(\\1)[^>]*/?>"));
		//rex3.setNonValidPattern(Pattern.compile("<img(?=\\s)[^>]*\\ssrc=([\"'])([^>]*?)(\\1)[^>]*/?>"));
		
		System.out.println(System.identityHashCode(rex));
		System.out.println(System.identityHashCode(rex2));
		System.out.println(System.identityHashCode(rex3));
		
		rex.RexInfo(a);
		rex.RexInfo(b);
		rex.RexInfo(c);
	}

}
