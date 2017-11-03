package com.dbmi.somaWebd;

//import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//import org.junit.Test;

public class RandomSelectSOMA {


		public static String getRandomCountry()
		{
				String List [] = { 
						
						"United States",
						"Afghanistan",
						"Akrotiri",
						"Albania",
						"Algeria",
						"American Samoa",
						"Andorra",
						"Angola",
						"Anguilla",
						"Antarctica",
						"Antigua and Barbuda",
						"Argentina",
						"Armenia",
						"Aruba",
						"Ashmore and Cartier Islands",
						"Australia",
						"Austria",
						"Azerbaijan",
						"Bahamas, The",
						"Bahrain",
						"Bangladesh",
						"Barbados",
						"Bassas da India",
						"Belarus",
						"Belgium",
						"Belize",
						"Benin",
						"Bermuda",
						"Bhutan",
						"Bolivia",
						"Bosnia and Herzegovina",
						"Botswana",
						"Bouvet Island",
						"Brazil",
						"British Indian Ocean Territory",
						"British Virgin Islands",
						"Brunei",
						"Bulgaria",
						"Burkina Faso",
						"Burma",
						"Burundi",
						"Cambodia",
						"Cameroon",
						"Canada",
						"Cape Verde",
						"Cayman Islands",
						"Central African Republic",
						"Chad",
						"Chile",
						"China",
						"Christmas Island",
						"Clipperton Island",
						"Cocos (Keeling) Islands",
						"Colombia",
						"Comoros",
						"Congo, Democratic Republic of",
						"Congo, Republic of the",
						"Cook Islands",
						"Coral Sea Islands",
						"Costa Rica",
						"Cote d'Ivoire",
						"Croatia",
						"Cuba",
						"Cyprus",
						"Czech Republic",
						"Denmark",
						"Dhekelia",
						"Djibouti",
						"Dominica",
						"Dominican Republic",
						"Ecuador",
						"Egypt",
						"El Salvador",
						"Equatorial Guinea",
						"Eritrea",
						"Estonia",
						"Ethiopia",
						"Europa Island",
						"Falkland Islands (Islas Malvin",
						"Faroe Islands",
						"Fiji",
						"Finland",
						"France",
						"French Guiana",
						"French Polynesia",
						"French Southern and Antarctic",
						"Gabon",
						"Gambia, The",
						"Gaza Strip",
						"Georgia",
						"Germany",
						"Ghana",
						"Gibraltar",
						"Glorioso Islands",
						"Greece",
						"Greenland",
						"Grenada",
						"Guadeloupe",
						"Guam",
						"Guatemala",
						"Guernsey",
						"Guinea-Bissau",
						"Guinea",
						"Guyana",
						"Haiti",
						"Heard Island and McDonald Isla",
						"Holy See (Vatican City)",
						"Honduras",
						"Hong Kong",
						"Hungary",
						"Iceland",
						"India",
						"Indonesia",
						"Iran",
						"Iraq",
						"Ireland",
						"Isle of Man",
						"Israel",
						"Italy",
						"Jamaica",
						"Jan Mayen",
						"Japan",
						"Jersey",
						"Jordan",
						"Juan de Nova Island",
						"Kazakhstan",
						"Kenya",
						"Kiribati",
						"Korea, North",
						"Korea, South",
						"Kuwait",
						"Kyrgyzstan",
						"Laos",
						"Latvia",
						"Lebanon",
						"Lesotho",
						"Liberia",
						"Libya",
						"Liechtenstein",
						"Lithuania",
						"Luxembourg",
						"Macau",
						"Macedonia",
						"Madagascar",
						"Malawi",
						"Malaysia",
						"Maldives",
						"Mali",
						"Malta",
						"Marshall Islands",
						"Martinique",
						"Mauritania",
						"Mauritius",
						"Mayotte",
						"Mexico",
						"Micronesia, Federated States o",
						"Moldova",
						"Monaco",
						"Mongolia",
						"Morocco",
						"Montserrat",
						"Mozambique",
						"Namibia",
						"Nauru",
						"Navassa Island",
						"Nepal",
						"Netherlands",
						"Netherlands Antilles",
						"New Caledonia",
						"New Zealand",
						"Nicaragua",
						"Niger",
						"Nigeria",
						"Niue",
						"Norfolk Island",
						"Northern Mariana Islands",
						"Norway",
						"Oman",
						"Pakistan",
						"Palau",
						"Panama",
						"Papua New Guinea",
						"Paracel Islands",
						"Paraguay",
						"Peru",
						"Philippines",
						"Pitcairn Islands",
						"Poland",
						"Portugal",
						"Puerto Rico",
						"Qatar",
						"Reunion",
						"Romania",
						"Russia",
						"Rwanda",
						"Saint Helena",
						"Saint Kitts and Nevis",
						"Saint Lucia",
						"Saint Pierre and Miquelon",
						"Saint Vincent and the Grenadin",
						"Samoa",
						"San Marino",
						"Sao Tome and Principe",
						"Saudi Arabia",
						"Senegal",
						"Serbia and Montenegro",
						"Seychelles",
						"Sierra Leone",
						"Singapore",
						"Slovakia",
						"Slovenia",
						"Solomon Islands",
						"Somalia",
						"South Africa",
						"South Georgia and the South Sa",
						"Spain",
						"Spratly Islands",
						"Sri Lanka",
						"Sudan",
						"Suriname",
						"Svalbard",
						"Swaziland",
						"Sweden",
						"Switzerland",
						"Syria",
						"Taiwan",
						"Tajikistan",
						"Tanzania",
						"Thailand",
						"Timor-Leste",
						"Togo",
						"Tokelau",
						"Tonga",
						"Trinidad and Tobago",
						"Tromelin Island",
						"Tunisia",
						"Turkey",
						"Turkmenistan",
						"Turks and Caicos Islands",
						"Tuvalu",
						"Uganda",
						"Ukraine",
						"United Arab Emirates",
						"United Kingdom",
						"Uruguay",
						"Uzbekistan",
						"Vanuatu",
						"Venezuela",
						"Vietnam",
						"Virgin Islands",
						"Wake Island",
						"Wallis and Futuna",
						"West Bank",
						"Western Sahara",
						"Yemen",
						"Zambia",
						"Zimbabwe",

						};
				Random Dice = new Random(); 
				int random = Dice.nextInt(256);
				return (List[random]);
	}

		//Clicks
		
		//special option
		public static String getOptProgram()
		{
				String List [] = { "Certificate", "Doctoral (PhD)", "Masters (MS)"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(3);
					return (List[random]);
	}
		public static String getOptYesNo()
		{
				String List [] = { "Yes", "No"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(2);
					return (List[random]);
	}
		public static String getOptyesno()
		{
				String List [] = { "yes", "no"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(2);
					return (List[random]);
	}
		
		public static String getVetOptyesnoRadio()
		{
				String List [] = { "edit-veteran-yes", "edit-veteran-no"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(2);
					return (List[random]);
	}

		public static String getEduOptyesnoRadio()
		{
				String List [] = { "edit-education-benefit-yes", "edit-education-benefit-no"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(2);
					return (List[random]);
	}

		public static String getOptCityShipType()
		{
				String List [] = { "Citizen of Another Country", "Refugee",
						"U.S. Immigrant/Permanent Resident", "United States Citizen"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(4);
					return (List[random]);
	}

		public static String getOptVisaType()
		{
				String List [] = { "Exchange Visitor (J-1)",
						"Refugee in the US", "Student (F-1)", 
						"U.S. Immigrant/Permanent Resident"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(4);
					return (List[random]);
	}
		
		public static String getOptPennRes()
		{
				String List [] = { "No", "Yes (less than 1 year)", "Yes (more than 1 year)"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(3);
					return (List[random]);
	}
		
		//Degree type
		
		public static String getDegreeType()
		{
				String List [] = { 
						"Bachelor of Arts",
						"Bachelor of Dental Surgery",
						"Bachelor of Engineering",
						"Bachelor of Medicine",
						"Bachelor of Nursing",
						"Bachelor of Science",
						"Bachelor of Surgery",
						"Bachelor of Technology",
						"Doctor of Dental Medicine",
						"Doctor of Dental Surgery",
						"Doctor of Medicine",
						"Doctor of Osteopathy",
						"Doctor of Pharmacy",
						"Doctor of Philosophy",
						"Doctor of Physical Therapy",
						"Doctor of Science",
						"Doctor of Veterinary Medicine",
						"Master of Arts",
						"Master of Science",
						"Masters of Business Administration",
						"Masters of Engineering",
						"Masters of Health Administration",
						"Masters of Library & Information Science",
						"Masters of Public Health",
						"No Degree Expected",
						"Other"

				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(25);
					return (List[random]);
	}
		
		//major type
		public static String getOptMajor()
		{
				String List [] = { 
						
						"Anatomy",
						"Biochemistry",
						"Biology",
						"Biomathematics",
						"Biomedical Engineering",
						"Biomedical Science",
						"Biophysics",
						"Chemistry",
						"Cognitive Neuroscience",
						"Computational Mathematics",
						"Computer Science",
						"Dentistry",
						"Electrical Engineering",
						"Engineering",
						"Genetics",
						"Human Biology",
						"Information Science and Technology",
						"Information and Communication Technology",
						"Medicine",
						"Microbiology/bacteriology",
						"Molecular Biology",
						"Natural Sciences",
						"Neuroscience/Neurology",
						"No Major",
						"Nursing",
						"Pathology",
						"Pharmacology",
						"Pharmacy",
						"Physics",
						"Physiology",
						"Psychobiology",
						"Psychology",
						"Statistics",
						"Veterinary Medicine",
						"Zoology",
						"Other" 

				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(35);
					return (List[random]);
	}
		
		//Type of work
		public static String getOptTypWork()
		{
				String List [] = { "Extracurricular Activity",
						"Military Service", 
						"Paid Employment",
						"Student Employment",
						"Volunteer Work",
						"Other",
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(6);
					return (List[random]);
	}
		//Type of work
		public static String getOptTypDoc()
		{
				String List [] = { "Curriculum Vitae",
						"Research Article", 
						"Resume",
						"Other",
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(4);
					return (List[random]);
	}	
		
		
		//male-female
		public static String getOptMFD()
		{
				String List [] = { "Male", "Female", "Do not wish to respond"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(2);
					return (List[random]);
	}
		
		//male-female
		public static String getOptYND()
		{
				String List [] = { "Yes", "No", "Do not wish to respond"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(3);
					return (List[random]);
	}
			
		//Disability
		public static String getOptDisAbl()
		{
				String List [] = { 
						"learning",
						"hearing",
						"visual",
						"mobilityorthopedic-impairment",
						"other"

				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(5);
					return (List[random]);
	}
		
		
		public static String whatCapacity()
		{
				String List [] = { 
						"edit-known-capacity-as-student-in-a-large-lecture-course", 
						"edit-known-capacity-as-student-in-a-lab-course", 
						"edit-known-capacity-as-student-in-small-class",
						"edit-known-capacity-as-hisher-advisor",
						"edit-known-capacity-as-hisher-employer",
						"edit-known-capacity-as-researcher-under-your-direction"
//						"edit-known-capacity-other"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(6);
					return (List[random]);
	}
	
		public static String whatRank()
		{
				String List [] = { 
						"Top 1%",
						"Upper 5%",
						"10%",
						"25%",
						"50%",
						"Lower 50%",
						"Cannot assess"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(7);
					return (List[random]);
	}
		
		//Other Info Payment
		public static String getOthInfPayment()
		{
				String List [] = { "edit-confirmation-check",
						"edit-confirmation-waived", 
						"edit-confirmation-credit-card"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(3);
					return (List[random]);
	}
		
		//Other Info Payment
		public static String getPriority()
		{
				String List [] = { 
						"1-High Priority Applicant",
						"2-Strong Applicant",
						"3-Acceptable Candidate",
						"4-Weak Applicant",
						"5-Very Weak Applicant"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(5);
					return (List[random]);
	}

		//Final decision
		public static String getFinalDec()
		{
				String List [] = { 
						"Accept",
						"Reject"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(2);
					return (List[random]);
	}
		
		//Potential funding
		public static String getPotenFund()
		{
				String List [] = { 
						"edit-funding-nlm",
						"edit-funding-forgarty",
						"edit-funding-grant",
						"edit-funding-departmental",
						"edit-funding-other"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(5);
					return (List[random]);
	}
		
	//Recommendation
		public static String getRecomSel()
		{
				String List [] = { 
						"Strong Accept",
						"Weak Accept",
						"Weak Reject",
						"Strong Reject"
				};
				Random Dice = new Random(); 
				int random = Dice.nextInt(4);
					return (List[random]);
	}
				//Radio button 4
				public static int getRandomRadOpt4()
				{
		int random = new Random().nextInt(3) + 1;
		return(random);
				}
				
				//Radio button 6
				public static int getRandomRadOpt6()
				{
		int random = new Random().nextInt(5) + 1;
		return(random);
				}
				
				
				//Radio button 7
				public static int getRandomRadOpt7()
				{
		int random = new Random().nextInt(6) + 1;
		return(random);
				}
				//Radio button 8
				public static int getRandomRadOpt8()
				{
		int random = new Random().nextInt(7) + 1;
		return(random);
				}
				//Radio button 9
				public static int getRandomRadOpt9()
				{
		int random = new Random().nextInt(8) + 1;
		return(random);
				}
		
				//Radio button 10
				public static int getRandomRadOpt10()
				{
		int random = new Random().nextInt(9) + 1;
		return(random);
				}
				//Radio button 11
				public static int getRandomRadOpt11()
				{
		int random = new Random().nextInt(10) + 1;
		return(random);
				}
				
				//Radio button 11
				public static int getRandomRadOpt12()
				{
		int random = new Random().nextInt(11) + 1;
		return(random);
				}
				//Radio button 13
				public static int getRandomRadOpt13()
				{
		int random = new Random().nextInt(12) + 1;
		return(random);
				}
				//Radio button 14
				public static int getRandomRadOpt14()
				{
		int random = new Random().nextInt(13) + 1;
		return(random);
				}
				//Radio button 16
				public static int getRandomRadOpt16()
				{
		int random = new Random().nextInt(15) + 1;
		return(random);
				}
				//Radio button 22
				public static int getRandomRadOpt22()
				{
		int random = new Random().nextInt(21) + 1;
		return(random);
				}
				//Radio button 23
				public static int getRandomRadOpt23()
				{
		int random = new Random().nextInt(22) + 1;
		return(random);
				}
				
				//Radio button 26
				public static int getRandomRadOpt26()
				{
		int random = new Random().nextInt(25) + 1;
		return(random);
				}
				
				//Radio button 29
				public static int getRandomRadOpt29()
				{
		int random = new Random().nextInt(28) + 1;
		return(random);
				}
				//Radio button 29
				public static int getRandomRadOpt36()
				{
		int random = new Random().nextInt(35) + 1;
		return(random);
				}
		//Gender
		public static int getRandomRadioOpt3()
		{
		int random = new Random().nextInt(2) +1;
		return (random);
		}
		
		//Prospective or Retrospective
		public static int getRandomRadOpt2()
		{
				int random2 = new Random().nextInt(1) +1;
				return(random2);
		}
		
		//Further contact
		public static int getRandomFrCntact()
		{
		int randomFrtrcnt = new Random().nextInt(2);
		return(randomFrtrcnt);
		}
		
		//converting date
		
		public static String getRandomFutureDt()
		{
			DateFormat dateFormat= new SimpleDateFormat("MM/yyyy");
			Date date= new Date();
			String dateString= dateFormat.format(date);
			return (dateString);
		}
		//getting a number greater than 1 and less than 5
		public static int getRandomNum1to5()
		{
		int aNumber = 1 + (int) (Math.random() * ((5 - 1) +1));
		return(aNumber);
		}
		//getting a number greater than 12 and less than 20
				public static int getRandomNum12to20()
				{
				int aNumber = 12 + (int) (Math.random() * ((20 - 12) +1));
				return(aNumber);
				}
		//getting a number greater than 5 and less than 26
				public static int getRandomNum2to8()
				{
				int aNumber = 2 + (int) (Math.random() * ((8 - 2) + 1));
				return(aNumber);
				}
		
		//getting a number greater than 20 and less than 140
		public static int getRandom20to40()
		{
		int aNumber = 20 + (int) (Math.random() * ((40-19) + 1));
		return(aNumber);
		}		
		//getting a number greater than 50 and less than 101
		public static int getRandom20to100()
		{
		int aNumber = 20 + (int) (Math.random() * ((100-19) + 1));
		return(aNumber);
		}
		
		//getting a number greater than 150 and less than 201
		public static int getRandom120to200()
		{
		int aNumber = 120 + (int) (Math.random() * ((200 - 120) + 1));
		return(aNumber);
		}
		//Getting Random Number between 1900 to 2011
		public static int getRandom1900to1994()
		{
		int aNumber = 1900 + (int) (Math.random() * ((1994 -1900) + 1));
		return(aNumber);
		}
}
