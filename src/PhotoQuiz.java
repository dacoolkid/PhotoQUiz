 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {
	String lilbroomstick;
	String jerry;
	
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)

		String lilbroomstick = "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/78/78696f212360d08cc78c866634349552d902d410_full.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component picture;


		// 3. use the "createImage()" method below to initialize your Component
		 picture = createImage(lilbroomstick);

		// 4. add the image to the quiz window
		 quizWindow.add(picture);

		// 5. call the pack() method on the quiz window
		 quizWindow.pack();

		// 6. ask a question that relates to the image
		 String question = JOptionPane.showInputDialog("Swept Up?");

		// 7. print "CORRECT" if the user gave the right answer
		 if(question.equals("Lil Broomstick")){
			 JOptionPane.showMessageDialog(null,"Correct" );
			 
		 }
		 else{
			 JOptionPane.showMessageDialog(null, "Incorrect");
		 }

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		 quizWindow.remove(picture);

		// 10. find another image and create it (might take more than one line of code)
		 String jerry = "http://vignette2.wikia.nocookie.net/tomandjerrykidsshow/images/2/29/Jerry_2.png/revision/latest?cb=20131227002152";

		 Component picture2;
		// 11. add the second image to the quiz window
		 picture2 = createImage(jerry);
		 quizWindow.add(picture2);
	
		// 12. pack the quiz window
		 quizWindow.pack();
		 

		// 13. ask another question
		 String question2 = JOptionPane.showInputDialog("Jurry spooops Tom because Tom is a stooooopid cat, why Jurry Spoop Tom?");
		 if(question2.equals("Becus Tom is a stooooopid cut")){
			 JOptionPane.showMessageDialog(null,"Correct" );
			 
		 }
		 else{
			 JOptionPane.showMessageDialog(null, "Incorrect");
		 }

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}




