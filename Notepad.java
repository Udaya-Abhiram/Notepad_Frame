import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
class Notepad extends Frame implements ActionListener
{
	public  void Notepad()
	{
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		MenuShortcut n = new MenuShortcut(KeyEvent.VK_N);
		MenuShortcut o = new MenuShortcut(KeyEvent.VK_O);
		MenuShortcut s= new MenuShortcut(KeyEvent.VK_S);
		MenuShortcut p= new MenuShortcut(KeyEvent.VK_P);

		MenuShortcut z= new MenuShortcut(KeyEvent.VK_Z);
		MenuShortcut x= new MenuShortcut(KeyEvent.VK_X);
		MenuShortcut c= new MenuShortcut(KeyEvent.VK_C);
		MenuShortcut v= new MenuShortcut(KeyEvent.VK_V);
		MenuShortcut f= new MenuShortcut(KeyEvent.VK_F);
		MenuShortcut a= new MenuShortcut(KeyEvent.VK_A);
		MenuShortcut e= new MenuShortcut(KeyEvent.VK_E);
		MenuShortcut h= new MenuShortcut(KeyEvent.VK_H);
		MenuShortcut g= new MenuShortcut(KeyEvent.VK_G);

		MenuShortcut plus = new MenuShortcut(KeyEvent.VK_PLUS);
		MenuShortcut minus= new MenuShortcut(KeyEvent.VK_MINUS);
		
		Menu filemenu = new Menu("File");
		Menu editmenu = new Menu("Edit");
		Menu formatmenu = new Menu("Format");
		Menu viewmenu = new Menu("View");
		Menu helpmenu = new Menu("Help");

		
			MenuItem newAction = new MenuItem("New",n);
			MenuItem new1Action = new MenuItem("New Window....");
			MenuItem openAction = new MenuItem("Open",o);
			MenuItem saveAction = new MenuItem("Save",s);
			MenuItem saveasAction = new MenuItem("Save As...");
			MenuItem pagesetupAction = new MenuItem("Page Setup....");
			MenuItem printAction = new MenuItem("Print",p);
			MenuItem exitAction = new MenuItem("Exit");

			MenuItem undoAction = new MenuItem("Undo",z);
			MenuItem cutAction = new MenuItem("Cut",x);
			MenuItem copyAction = new MenuItem("Copy",c);
			MenuItem pasteAction = new MenuItem("Paste",v);
			MenuItem deleteAction = new MenuItem("Delete");
			MenuItem searchwithbingAction = new MenuItem("Search with Bing...",e);
			MenuItem findAction = new MenuItem("Find",f);
			MenuItem findnextAction = new MenuItem("Find Next...");
			MenuItem findPreviousAction = new MenuItem("Find Previous...");
			MenuItem replaceAction = new MenuItem("Replace",h);
			MenuItem gotoAction = new MenuItem("GoTo",g);
			MenuItem selectallAction = new MenuItem("Select All",a);
			MenuItem timedateAction = new MenuItem("Time/Date");

			MenuItem wordAction = new MenuItem ("Word Wrap...");
			Menu fontAction = new Menu("Font \t\t\t\t");

			Menu font = new Menu("Font");
			Menu fontstyle = new Menu("Font style");
			Menu size = new Menu("Size");

			MenuItem alge = new MenuItem("Algerian");
			MenuItem aigd = new MenuItem("Aigdt");
			MenuItem aria = new MenuItem("Arial");
			MenuItem book = new MenuItem("Bookman Old Style");
			MenuItem cons = new MenuItem("Constantia");
			MenuItem calb = new MenuItem("Calbri");
			MenuItem elep = new MenuItem("Elephant");
			MenuItem fort = new MenuItem("Forte");
			MenuItem gara = new MenuItem("Garamond");
			MenuItem isoc = new MenuItem("Isocpeur");

			MenuItem bold = new MenuItem("Bold");
			MenuItem reg = new MenuItem("Regular");
			MenuItem ita = new MenuItem("Italic");
			MenuItem boi = new MenuItem("Bold Italic");

			

			Menu zoomAction = new Menu ("Zoom ");
			MenuItem statusBarAction = new MenuItem("Status Bar");
			MenuItem zoomin = new MenuItem("ZoomIn ",plus);
			MenuItem zoomout = new MenuItem("ZoomOut ",minus);
			MenuItem restore = new MenuItem("Restore to Default Size... \t\t\t\t");


			MenuItem viewhelpAction = new MenuItem("View Help");
			MenuItem sendfeedbackAction = new MenuItem("Send Feedback...");
			MenuItem aboutAction = new MenuItem("About Notepad...");

		newAction.addActionListener(this);
		openAction.addActionListener(this);
		exitAction.addActionListener(this);
		saveAction.addActionListener(this);
		printAction.addActionListener(this);

		filemenu.add(newAction);
		filemenu.add(new1Action);
		filemenu.add(openAction);
		filemenu.add(saveAction);
		filemenu.add(saveasAction);
		filemenu.addSeparator();
		filemenu.add(pagesetupAction);
		filemenu.add(printAction);
		filemenu.addSeparator();
		filemenu.add(exitAction);

		undoAction.addActionListener(this);
		cutAction.addActionListener(this);
		copyAction.addActionListener(this);
		pasteAction.addActionListener(this);
		selectallAction.addActionListener(this);
		findAction.addActionListener(this);
		replaceAction.addActionListener(this);
		searchwithbingAction.addActionListener(this);
		gotoAction.addActionListener(this);

		editmenu.add(undoAction);
		editmenu.addSeparator();
		editmenu.add(cutAction);
		editmenu.add(copyAction);
		editmenu.add(pasteAction);
		editmenu.add(deleteAction);
		editmenu.addSeparator();
		editmenu.add(searchwithbingAction);
		editmenu.add(findAction);
		editmenu.add(findnextAction);
		editmenu.add(findPreviousAction);
		editmenu.add(replaceAction);
		editmenu.add(gotoAction);
		editmenu.addSeparator();
		editmenu.add(selectallAction);
		editmenu.add(timedateAction);

		formatmenu.add(wordAction);
		formatmenu.add(fontAction);
		fontAction.add(font);
		font.add(alge);
		font.add(aigd);
		font.add(aria);
		font.add(book);
		font.add(cons);
		font.add(calb);
		font.add(elep);
		font.add(fort);
		font.add(gara);
		font.add(isoc);
		fontAction.add(fontstyle);
		fontstyle.add(bold);
		fontstyle.add(reg);
		fontstyle.add(ita);
		fontstyle.add(boi);
		fontAction.add(size);
		for(int i = 4 ; i<30 ; i+=2)
			{
				MenuItem sizeMenu = new MenuItem(" "+i);
				size.add(sizeMenu);

			}
		

		viewmenu.add(zoomAction);
		viewmenu.add(statusBarAction);
		zoomAction.add(zoomin);
		zoomAction.add(zoomout);
		zoomAction.addSeparator();
		zoomAction.add(restore);


		helpmenu.add(viewhelpAction);
		helpmenu.add(sendfeedbackAction);
		helpmenu.addSeparator();
		helpmenu.add(aboutAction);

			mb.add(filemenu);
			mb.add(editmenu);
			mb.add(formatmenu);
			mb.add(viewmenu);
			mb.add(helpmenu);

			
			TextArea ta = new TextArea();
			add(ta);
		
			setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC,12));
			
		addWindowListener(new WindowAdapter()
		{


			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}

		});

	}
	public void actionPerformed(ActionEvent ae)
	{
		String action = ae.getActionCommand();
		if(action.equals("New"))
			System.out.println("New File opened");
		else if(action.equals("Open"))
			System.out.println("File opened");
		else if(action.equals("Exit"))
			System.exit(0);
		else if(action.equals("Save"))
			System.out.println("File Saved");
		else if(action.equals("Print"))
			System.out.println("File Printed");

		else if(action.equals("Undo"))
			System.out.println("Undo Action");
		else if(action.equals("Cut"))
			System.out.println("Cut");
		else if(action.equals("Copy"))
			System.out.println("Data Copied");
		else if(action.equals("Paste"))
			System.out.println("Data Pasted");
		else if(action.equals("Find"))
			System.out.println("Searching Data..");
		else if(action.equals("Replace"))
			System.out.println("Data Replaced");
		else if(action.equals("Select All"))
			System.out.println("All Data Selected");
	}

	public static void main(String args[])
	{
		Notepad md = new Notepad();
		md.Notepad();
		md.setSize(500,500);
		md.setVisible(true);
		md.setTitle("Notepad");
	}
}