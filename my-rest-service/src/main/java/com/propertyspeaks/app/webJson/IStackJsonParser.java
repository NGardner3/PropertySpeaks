package com.propertyspeaks.app.webJson;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.propertyspeaks.app.data.Attributes;

public interface IStackJsonParser {

	List<Attributes> parseJson(InputStream in) throws IOException;

}