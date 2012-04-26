
public class DataFactory {

	public DataAccess getDataSource(String dataSourceType){
		if (dataSourceType == "SQL"){
			return new SqlDataSource();
		}
		if (dataSourceType == "XML"){
			return new XMLDataSource();
		}
		return null;
		
	}
	
}
