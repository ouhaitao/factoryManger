package service;

import java.util.Map;

public interface MaterialService {

	String addMaterial(Map<String,String> map);

	String deleteMaterial(Map<String,String> map);

	String scrapMaterial(Map<String,String> map);


}
