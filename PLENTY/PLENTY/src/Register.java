import java.util.*;


public class Register {

   
    public Register()
    {
    }
    
    public void LogInAsNormal( String Name ,String PassWord , Vector <NormalUser> n_user)
    {
    	boolean check=false;
    	for(int i=0;i<n_user.size();i++)
    	{
    		if(n_user.get(i).UserName==Name &&n_user.get(i).getPassword()==PassWord)
    		{
    			check=true ;
    			System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
    			break;
    		}
    		else if(n_user.get(i).UserName==Name &&n_user.get(i).getPassword()!=PassWord)
    		{
    			System.out.println(" I think there is something gwrong in your password " + n_user.get(i).UserName +" \n");
    			System.out.println("Click '1' if you want to re enter password and '2' if you forgot It ");
    			Scanner n = new Scanner(System.in);
    			int choice=n.nextInt();
    			switch(choice)
    			{
    			case 1 :
	    			{
	    				Scanner s = new Scanner(System.in);
	    				String ReEntered=s.nextLine();
	    				if(ReEntered==n_user.get(i).getPassword())
	    				{
	    					check=true;
	    					System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
	    				}
	    				break;
	    			}
    			case 2 :
	    			{
	    				System.out.println("Enter youe Email");
	    				Scanner s = new Scanner(System.in);
	    				String ReEntered=s.nextLine();
	    				if(n_user.get(i).getEmail()==ReEntered)
	    				{
	    					check=true;
	    					System.out.println("Your PassWord is  " + n_user.get(i).getPassword() );
	    					
	    					System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
	    					
	    					//break;
	    				}
	    				else
	    				{
	    					System.out.println("Sorry Failed " );
	    				}
	    				break;
	    			}
    			
    			}
    		}
    		else 
    		{
    			continue; 
    		}
    		
    	}
    	
    	
    	if(check==false)
    	{
    		System.out.println("Sorry Log In faild ");
    	}
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void LogInAsStoreOwner( String Name ,String PassWord , Vector <StoreOwner> n_user)
    {
    	boolean check=false;
    	for(int i=0;i<n_user.size();i++)
    	{
    		if(n_user.get(i).UserName==Name &&n_user.get(i).getPassword()==PassWord)
    		{
    			check=true ;
    			System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
    			break;
    		}
    		else if(n_user.get(i).UserName==Name &&n_user.get(i).getPassword()!=PassWord)
    		{
    			System.out.println(" I think there is something gwrong in your password " + n_user.get(i).UserName +" \n");
    			System.out.println("Click '1' if you want to re enter password and '2' if you forgot It ");
    			Scanner n = new Scanner(System.in);
    			int choice=n.nextInt();
    			switch(choice)
    			{
    			case 1 :
	    			{
	    				Scanner s = new Scanner(System.in);
	    				String ReEntered=s.nextLine();
	    				if(ReEntered==n_user.get(i).getPassword())
	    				{
	    					check=true;
	    					System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
	    				}
	    				break;
	    			}
    			case 2 :
	    			{
	    				System.out.print("Enter youe Email");
	    				Scanner s = new Scanner(System.in);
	    				String ReEntered=s.nextLine();
	    				if(n_user.get(i).getEmail()==ReEntered)
	    				{
	    					check=true;
	    					System.out.println("Your PassWord is  " + n_user.get(i).getPassword() );
	    					
	    					System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
	    					
	    					//break;
	    				}
	    				else
	    				{
	    					System.out.println("Sorry Failed " );
	    				}
	    				break;
	    			}
    			
    			}
    		}
    		else 
    		{
    			continue; 
    		}
    		
    	}
    	
    	
    	if(check==false)
    	{
    		System.out.println("Sorry Log In faild ");
    	}
    }

    
   /////////////////////////////////////////////////////////////////////////////////////////////////

    public NormalUser RegisterNormalUser(String name ,String pass,String Email , String address,Vector<NormalUser> normal) //ana h5aly el user yda5al kol 7aga fl main w ab3atha henna 
    {
    	NormalUser newUser=null;
    	for(int i=0;i<normal.size();i++)
    	{
    		if(name==normal.get(i).UserName && pass==normal.get(i).getPassword()&& Email==normal.get(i).getEmail() && address== normal.get(i).Address)
    		{
    			System.out.println("This Account Already Exists ! ");
    		}
    		else if (name==normal.get(i).UserName)
    		{
    			System.out.println("This User Name Exist ReEnter New One");///ana w2ft hena 3ayza akaml case el cases law da5al 8alat tani w law 24ta da5alo sa7 
		    			for(int j=0;j<3;i++)//ha3eed el re intering till 3 marrat masalan 
		    			{
				    			Scanner inter=new Scanner(System.in);
				    			String New=inter.nextLine();
				    			if(New!=normal.get(i).UserName)
						    			{
						    				System.out.println("Valid One");//
						    				newUser.UserName=New;
						    				break;
						    			}
				    			else
						    			{
						    				System.out.println("This User Name Exist ReEnter New One");
						    	
						    				continue;
						    			}
				    	  }
		    			break;
    		}
    		else if (Email==normal.get(i).getEmail())
    		{
    		     System.out.println("This Email Exists ReEnter New One");///ana w2ft hena 3ayza akaml case el cases law da5al 8alat tani w law 24ta da5alo sa7 
    			for(int k=0;k<3;i++)
    			{
    			Scanner inter=new Scanner(System.in);
    			String New=inter.nextLine();
    			if(New !=Email && New!=normal.get(i).getEmail())
    			{
    				System.out.println("Valid One");//
    				newUser.Email=Email;
    			}
    			else
    			{
    				System.out.println("This User Name Exist ReEnter New One");//
    				continue;
    			}
    			break;
    			
		}
    		}
    		else{
    		     newUser=new NormalUser(name,Email,pass,address);
    		     break;
    			}
    		}
    	return newUser;
    	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    			
    public StoreOwner RegisterStoreOwner(String name ,String pass,String Email , String address,Vector<StoreOwner> Owners) //ana h5aly el user yda5al kol 7aga fl main w ab3atha henna 
    {
    	StoreOwner newUser=null;
    	for(int i=0;i<Owners.size();i++)
    	{
    		if(name==Owners.get(i).UserName && pass==Owners.get(i).getPassword()&& Email==Owners.get(i).getEmail() && address==Owners.get(i).Address)
    		{
    			System.out.println("This Account Already Exists ! ");
    		}
    		else if (name==Owners.get(i).UserName)
    		{
    			System.out.println("This User Name Exist ReEnter New One");///ana w2ft hena 3ayza akaml case el cases law da5al 8alat tani w law 24ta da5alo sa7 
		    			for(int j=0;j<3;i++)//ha3eed el re intering till 3 marrat masalan 
		    			{
				    			Scanner inter=new Scanner(System.in);
				    			String New=inter.nextLine();
				    			if(New!=Owners.get(i).UserName)
						    			{
						    				System.out.println("Valid One");//
						    				newUser.UserName=New;
						    				break;
						    			}
				    			else
						    			{
						    				System.out.println("This User Name Exist ReEnter New One");
						    	
						    				continue;
						    			}
				    	  }
		    			break;
    		}
    		else if (Email==Owners.get(i).getEmail())
    		{
    		     System.out.println("This Email Exists ReEnter New One");///ana w2ft hena 3ayza akaml case el cases law da5al 8alat tani w law 24ta da5alo sa7 
    			for(int k=0;k<3;i++)
    			{
    			Scanner inter=new Scanner(System.in);
    			String New=inter.nextLine();
    			if(New !=Email && New!=Owners.get(i).getEmail())
    			{
    				System.out.println("Valid One");//
    				newUser.Email=Email;
    			}
    			else
    			{
    				System.out.println("This User Name Exist ReEnter New One");//
    				continue;
    			}
    			break;
    			
		}
    		}
    		else{
    		     newUser=new StoreOwner(name,Email,pass,address);
    		     break;
    			}
    		}
    	return newUser;
    	}
    	
    	
       
  
    
   
    

}