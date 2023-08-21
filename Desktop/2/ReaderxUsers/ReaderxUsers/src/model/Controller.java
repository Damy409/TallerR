package model;

import java.util.Calendar;

public class Controller {

	private User[] users;

	public Controller() {

		users = new User[10];

	}


	public String getUserList() {

		String msg = "";

		for (int i = 0; i < users.length; i++) {

			if (users[i] != null) {
				msg += "\n" + (i + 1) + ". " + users[i].getId() + " - " + users[i].getName();
			}

		}

		return msg;

	}

	public boolean registerUser(int typeUser, String id, String name, String nickname, int categoryPremium) {

		CategoryPremium category = CategoryPremium.POR_DEFINIR;

		if(categoryPremium== 1){

			category = CategoryPremium.ORO;

		}else if(categoryPremium == 2){

			category = CategoryPremium.PLATA;

		}else{

			category = CategoryPremium.DIAMANTE;
		}

		User user;

		Calendar singUpDate = Calendar.getInstance();

        for(int i=0; i<users.length;i++){

            if(users[i] == null){

                switch (typeUser) {

                    case 2:
                        user  = new UserRegular(id, name, nickname, singUpDate);
                        users[i] = user;
                        break;
                    case 1:
                        user = new UserPremium(id, name, nickname, singUpDate, category);
                        users[i] = user;
                        break;
                }
                
                return true;
            }
        }

		return false;
	}

	public boolean editUser(int userPosition, int optionN, String nameN) {

		CategoryPremium category = null;

		if(optionN != 0){

			switch(optionN){
				case 1:
					category = CategoryPremium.ORO;
					break;
				case 2:
					category = CategoryPremium.PLATA;
					break;
				case 3:
					category = CategoryPremium.DIAMANTE;
					break;
			}

			((UserPremium)(users[userPosition])).setCategoryPremium(category);

			return true;

		}

		if(nameN.equals("")){
			return true;
		}else{

			users[userPosition].setName(nameN);
			return true;
		}

		
	}

	public String getTypeU(int option){

		String msg = "";

		if(users[option] instanceof UserPremium){
			msg +="Premium";
		}

		if(users[option] instanceof UserRegular){
			msg +="Regular";
		}

		return msg;

	}


	public boolean deleteUser(int option){

		users[option] = null;

		return true;

	}
	

	public String getUserInfo(int option) {

		String msg = "";

		if(users[option] instanceof UserPremium ){

			msg += "Usuario premium: "
			+ "    public String getMaterials();Id: " + users[option].getId()
			+ "\nName: " + users[option].getName() 
			+ "\nNickname: " + users[option].getNickname()
			+ "\nSignUpDate: " + users[option].getSignUpDate()
			+ "\nCategory Premium: "+ ((UserPremium)(users)[option]).getCategoryPremium(); 
		}

		if(users[option] instanceof UserRegular){

			msg += "Usuario regular: "
			+ "\nId: " +users[option].getId()
			+ "\nName: " + users[option].getName()
			+ "\nNickname: " + users[option].getNickname() 
			+ "\nSignUpDate: " + users[option].getSignUpDate();
		}

		return msg;
	}

	public String getAllUserInfo() {

		String msg = "";

		int usersP = 0;
		int usersR = 0;
		int plata = 0;
		int oro = 0;
		int diamante = 0;
		CategoryPremium category;

		for(int i=0; i<users.length;i++){
			
			if(users[i] instanceof UserPremium){

				category = ((UserPremium)(users[i])).getCategoryPremium();

				if(category == CategoryPremium.ORO){
					oro +=1;
				}
				if(category == CategoryPremium.PLATA){
					plata +=1;
				}
				if(category == CategoryPremium.DIAMANTE){
					diamante +=1;
				}

				usersP += 1;
			}

			if(users[i] instanceof UserRegular){
				usersR += 1;
			}
		}

		msg += "\nNumero de usuarios premium: " + usersP
		+ "\nNumero de usuarios regulares: " + usersR
		+ "\nUsuarios premium con categvoria plata: " + plata
		+ "\nUsuarios premium con categoria oro: " + oro
		+ "\nUsuarios premium con categoria diamante: " + diamante;
		
		return msg;
	}

}
