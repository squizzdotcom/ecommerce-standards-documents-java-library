package EcommerceStandardsDocuments;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.IOException;
import java.util.HashMap;

/**
 *  Runs unit testing for Ecommerce Standards Document library
 */
public class Main {
    public static void main(String[] args){
        System.out.println("ESD Product Document Testing");
        
        //create a list of products
        ArrayList<ESDRecordProduct> productsList = new ArrayList<ESDRecordProduct>();
        ESDRecordProduct product = new ESDRecordProduct();
        product.keyProductID = "123A";
        product.productCode = "PROD-123";
        product.keyTaxcodeID = "FREE";
        productsList.add(product);
        
        product = new ESDRecordProduct();
        product.keyProductID = "1234";
        product.productCode = "PROD-001";
        product.keyTaxcodeID = "GST";
        productsList.add(product);
        
        //list all the properties being set within in the records within the document's configs object
        HashMap<String, String> configs = new HashMap<String,String>();
        configs.put("dataRecords", "keyProductID,productCode,keyTaxcodeID");
        
        //create a product ESD document
        ESDocumentProduct productDoc = new ESDocumentProduct(ESDocumentConstants.RESULT_SUCCESS, "successfully obtained data", productsList.toArray(new ESDRecordProduct[0]), configs);
        
        //create JSON mapper for serialisation and deserialization
        ObjectMapper jsonObjectMapper = new ObjectMapper();
        
        //dont serialize properties that contain default values
        jsonObjectMapper.setSerializationInclusion(Include.NON_DEFAULT);
        
        try{
            //serialise document to JSON
            String productEsdJSON = jsonObjectMapper.writeValueAsString(productDoc);
            System.out.println(productEsdJSON);
            
            //deserialized JSON data to the ESD document
            ESDocumentProduct esdDeserializedProduct = jsonObjectMapper.readValue(productEsdJSON, ESDocumentProduct.class);
            System.out.println(esdDeserializedProduct.dataRecords[0].keyProductID);
            
        } catch (JsonGenerationException e) {
                System.err.println("Error generating JSON: " + e.getMessage());
        } catch (JsonMappingException e) {
                System.err.println("Error mapping JSON: " + e.getMessage());
        } catch (JsonProcessingException e) {
                System.err.println("Error processing JSON: " + e.getMessage());
        } catch (IOException e) {
                System.err.println("Error reading in JSON: " + e.getMessage());
        }
    }
}
