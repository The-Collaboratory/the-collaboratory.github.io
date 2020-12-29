package us.com.collaboratory.routes;

import java.io.InputStream;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RouteManualTest {

	private static String testString = "{\n"
			+ "    \"MY_ID_10.5281/.4263636\": {\n"
			+ "        \"link\": \"10.5281/zenodo.4263636\",\n"
			+ "        \"title\": \"Magnetic susceptibility imaging of human habenula at 3T\",\n"
			+ "        \"doc_type\": \"DATASET\",\n"
			+ "        \"doi\": \"182903048012\",        \n"
			+ "        \"publisher\": \"Zenodo\",        \n"
			+ "        \"externa_code\": \"Zenodo.27-37890\", \n"
			+ "        \"publication_date\": \"2020-11-09\",\n"
			+ "        \"structured_authors\" : [\n"
			+ "	{\n"
			+ "		\"name\": \"Author 1 Name\",\n"
			+ "		\"affiliation\" : \"University of Author 1\",\n"
			+ "		\"orcid\" : \"0000-0002-1825-0097\"\n"
			+ "	},\n"
			+ "	{\n"
			+ "		\"name\":\"Author	2 Name\",\n"
			+ "                \"affiliation\" :\"University of Author 2\",\n"
			+ "                \"orcid\"	: \"0000-0002-1825-0097\"\n"
			+ "	}\n"
			+ "	],\n"
			+ "	\"abstract\": \"Abstract\\n\\nThe habenula plays an important role in brain reward circuitry and psychiatric conditions. While much work has been done on the function and structure of the habenula in animal models, in vivo imaging studies of the human....een the susceptibility and the effective transverse relaxation rate (R2*) indicated that localized susceptibility enhancement in the habenula is more associated with increased paramagnetic (such as iron) rather than decreased diamagnetic (such as myelin) sources. Our results suggest that high-resolution QSM could make a potentially useful tool for substructure-resolved in vivo habenula imaging, and provide a groundwork for the future development of magnetic susceptibility as a quantitative biomarker for human habenula studies.\",\n"
			+ "        \"science_description\": \" susceptibility contrast is highly non-uniform within the habenula and across the subjects. In particular, we observed high prevalence of elevated susceptibility in the posterior subregion of the habenula. Correlation analysis between the susceptibility and the effective transverse relaxation rate (R2*) indicated that localized susceptibility enhancement in the habenula is more associated with increased paramagnetic (such as iron) rather than decreased diamagnetic (such as myelin) sources. Our results suggest that high-resolution QSM could make a potentially useful tool for substructure-resolved in vivo ha\",\n"
			+ "        \"meta_data\": \"Extra information in general\",\n"
			+ "        \"files\" : [\n"
			+ "	{\n"
			+ "		\"filename\": \"Argentina_Camarones.xlsx\",\n"
			+ "		\"approximateSize\" : 34714,\n"
			+ "		\"hash\" : \"md5:f866647b057c684898fa612904f3f200\"\n"
			+ "	},\n"
			+ "	{\n"
			+ "		\"filename\":	\"Argentina_Camarones_v1.1.xlsx\",\n"
			+ "                \"approximateSize\" : 35635,\n"
			+ "                \"hash\"	: \"md5:31f9133078546e9ad3826edea0cf6ab1\"\n"
			+ "	}\n"
			+ "	]\n"
			+ "        \n"
			+ "    },\n"
			+ "    \"MY_ID_10.5281/.4259554\": {\n"
			+ "        \"link\": \"10.5281/zenodo.4259554\",\n"
			+ "        \"title\": \"Data of NG paper \\\"Disproportionate Control on Aerosol Burden by Light Rain\\\"\",\n"
			+ "        \"doc_type\": \"DATASET\",\n"
			+ "        \"publisher\": \"Zenodo\",        \n"
			+ "        \"publication_date\": \"2020-11-08\",\n"
			+ "        \"externa_code\": \"Zenodo.27-37320\", \n"
			+ "        \"doi\": \"182903048012\", \n"
			+ "        \"unstructured_authors\": \"Lee Seung-Kyun, Yong Wang, Wenwen Xia, Xiaohong Liu, Shaocheng Xie, Wuyin Lin\",\n"
			+ "        \"abstract\": \"CAM5 and EAMv1 simulation data for NG paper entitled \\\"Disproportionate Control on Aerosol Burden by Light Rain\\\"\",\n"
			+ "        \"meta_data\": \"Extra information in general\"\n"
			+ "    },\n"
			+ "    \"MY_ID_10.5061/.bg79cnp81\": {\n"
			+ "        \"link\": \"10.5061/dryad.bg79cnp81\",\n"
			+ "        \"title\": \"Data from: Phylogenetic response of naraoiid arthropods to early - middle Cambrian environmental change\",\n"
			+ "        \"doc_type\": \"DATASET\",\n"
			+ "        \"externa_code\": \"Zenodo.27-32290\", \n"
			+ "	\"publisher\": \"Zenodo\",        \n"
			+ "        \"abstract\": \"The Cambrian Period, primarily known for animal life diversifying, experienced global extinctions. Pulses of extinction in Cambrian Series 2 are exemplified by the disappearance of archaeocyath sponges and olenelline and redlichiid trilobites. However, the effect of such extinctions on outer shelf organisms, as typify Burgess Shale-type (BST) deposits, remains relatively unknown. The phylogeny of naraoiid arthropods, represented in BST deposits.....gh the Series 2 extinctions suggests that deeper offshore marine environments were resilient to extinction during periods of environmental stress. This study therefore provides novel empirical support for the asylum of BST communities, which may contribute to the taxonomic longevity and widespread geographic distribution of taxa in these biotas.\"\n"
			+ "    }\n"
			+ "}"; 

	public static void main(String[] args) {
		String host = "http://localhost:17351/integrator/externalApi/create/document";
		
		 try (CloseableHttpClient client = HttpClients.createDefault()) {
             HttpPost postMethod = new HttpPost(host);
             String covertItemToJsonAPP = testString;
             StringEntity requestEntity = new StringEntity(
             		covertItemToJsonAPP, ContentType.APPLICATION_JSON);
     		postMethod.setEntity(requestEntity);

             CloseableHttpResponse response = client.execute(postMethod);
             InputStream inputStream = response.getEntity().getContent();
             System.out.println(inputStream.toString());
         } catch (Exception e) {
         	e.printStackTrace();
		}
		
	}
	
}
	
