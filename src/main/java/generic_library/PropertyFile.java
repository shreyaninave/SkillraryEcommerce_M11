package generic_library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {
public String getPropertydata(String Key) throws Throwable {
	Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.PropertyFilePath);
		p.load(fis);
		return p.getProperty(Key);
}
}

