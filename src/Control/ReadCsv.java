package Control;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Model.Data;

public class ReadCsv {
	   public ReadCsv(){
	        //반환용 리스트
	        List<Data> ret = new ArrayList<Data>();
	        BufferedReader br = null;
	        DBmanager DB = new DBmanager();
	        
	        try{
	            br = Files.newBufferedReader(Paths.get("DataCSV.csv"));
	            String line = "";
	            line = br.readLine();
	            while((line = br.readLine()) != null){
	                Data tmp = new Data();
	                String array[] = line.split(",");
	                //배열에서 리스트 반환
	                tmp.setNum(Integer.parseInt(array[0]));
	                tmp.setMonth(Integer.parseInt(array[1].substring(0, (array[1].length()/2)-1)));
	                tmp.setDate(Integer.parseInt(array[1].substring(array[1].length()/2, array[1].length()-1)));
	                try{tmp.setPeople_num(Integer.parseInt(array[2]));}catch(NumberFormatException ex) {};
	                tmp.setContry(array[3]);
	                tmp.setPeople_info(array[4]);
	                tmp.setArea(array[5]);
	                tmp.setTravel(array[6]);
	                tmp.setContact(array[7]);
	                tmp.setMeasures(array[8]);
	                tmp.setStatus(array[9]);
	                tmp.setRoute(array[10]);
	                tmp.setRegistration_d(array[11]);
	                tmp.setModified_d(array[12]);
	                tmp.setExposure(array[13]);
	                DB.save(tmp);
	            }
	        }catch(FileNotFoundException e){
	            e.printStackTrace();
	        }catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            try{
	                if(br != null){
	                    br.close();
	                }
	            }catch(IOException e){
	                e.printStackTrace();
	            }
	        }
	    }
	}