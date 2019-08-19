import java.util.Scanner;
 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity s= new ScientificStudent("");
		Kelas k= new Kelas();
		Teacher t=new Teacher();
		Echonomic e=new Echonomic("");
		Mathematic m= new Mathematic("");
		
	
		
		String jawab;
		Scanner sc=new Scanner(System.in );
		
		String username="";
		String password="";
			System.out.print("Username=");
				username=sc.next();
			System.out.print("Password=");
				password=sc.next();
				System.out.println("========================================");

				
				
				
				
				
				
				
				
		if(username.equals("admin")&&password.equals("admin123")) {
			
			
			
//			tes kategori
			int tes=0;
			for (int i=0;;i++){

				System.out.println("1. Scientific Studend");
				System.out.println("2. Social Student");
				System.out.println("========================================");
				tes = sc.nextInt();
				sc.nextLine();
				System.out.println("========================================");

				switch(tes){
				case 1:
				System.out.println("1. Udin");
				System.out.println("1. Bidin");
				System.out.println("1. Sidin");
				System.out.println("========================================");
				break;
				


				case 2:
				System.out.println("1. Inem");
				System.out.println("1. Tiyem");
				System.out.println("1. Kiyem");
				System.out.println("========================================");
				break;
				  default:
				
		
			
			
			
			
		}
			try {
				System.out.print("input Name \t:");
				jawab=sc.next();
				System.out.println("========================================");
				
		if (jawab.equals("Udin")) {
			
			s.Udin();
			k.setKelas("5");
			t.setTeacher("idih");
			m.setMathematic("90");
			System.out.println("KELAS \t: "+k.getKelas());
			System.out.println("TEACHER \t: "+t.getTeacher());
			System.out.println("NILAI EKONOMI \t: "+e.getEchonomic());
			System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
			System.out.println("========================================");
		}
		else if(jawab.equals("Bidin")) {
			s.Bidin();
			k.setKelas("6");
			t.setTeacher("BPK AHMAD");
			e.setEchonomic("9");
			m.setMathematic("73");
			System.out.println("KELAS \t: "+k.getKelas());
			System.out.println("TEACHER \t: "+t.getTeacher());
			System.out.println("NILAI EKONOMI \t: "+e.getEchonomic());
			System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
			System.out.println("========================================");
		}
		else if(jawab.equals("Sidin")){
			s.Sidin();
			k.setKelas("6");
			t.setTeacher("BPK AHMAD");
			e.setEchonomic("80");
			m.setMathematic("50");
			System.out.println("KELAS \t: "+k.getKelas());
			System.out.println("TEACHER \t: "+t.getTeacher());
			System.out.println("NILAI EKONOMI \t: "+e.getEchonomic());
			System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
			System.out.println("========================================");
		}
		else if(jawab.equals("Inem")){
			s.Inem();
			k.setKelas("4");
			t.setTeacher("BPK ARIF");
			e.setEchonomic("98");
			m.setMathematic("77");
			System.out.println("KELAS \t\t: "+k.getKelas());
			System.out.println("TEACHER \t: "+t.getTeacher());
			System.out.println("NILAI EKONOMI \t: "+e.getEchonomic());
			System.out.println("NILAI MATEMATIK : "+m.getMathematic());
			System.out.println("========================================");
		}
		else if(jawab.equals("Tiyem")){
			s.Tiyem();
			k.setKelas("4");
			t.setTeacher("BPK ARIF");
			e.setEchonomic("99");
			m.setMathematic("79");
			System.out.println("KELAS \t: "+k.getKelas());
			System.out.println("TEACHER \t: "+t.getTeacher());
			System.out.println("NILAI EKONOMI \t: "+e.getEchonomic());
			System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
			System.out.println("========================================");
		}
		else if(jawab.equals("Kiyem")){
			s.Kiyem();
			k.setKelas("4");
			t.setTeacher("BPK ARIF");
			e.setEchonomic("96");
			m.setMathematic("45");
			System.out.println("KELAS \t: "+k.getKelas());
			System.out.println("TEACHER \t: "+t.getTeacher());
			System.out.println("NILAI EKONOMI \t: "+e.getEchonomic());
			System.out.println("NILAI MATEMATIK \t: "+m.getMathematic());
			System.out.println("========================================");
		}
	    	}catch(Exception e1){System.out.print("username atau password tidak diketahui");
	    	}
			
	    }
	}
	}}

		
