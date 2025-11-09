package br.com.fiap.Services;

import br.com.fiap.beans.Hospital;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import java.io.IOException;


public class CepService<HttpEntity, Gson> {
    public Hospital getHospital(String cep) throws IOException {
    Hospital hospital = null;

    HttpGet request = new HttpGet("https://viacep.com.br/ws/" + cep + "/json/");

    CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

    CloseableHttpResponse response = httpClient.execute(request);

    HttpEntity entity = response.getEntity();

    if (entity != null) {
        // String Json
        String result = EntityUtils.toString(entity);

        // Gson para converter em um objeto Java
        Gson gson = new Gson();

        hospital = gson.fromJson(result, Hospital.class);
    }

    return hospital;
}
}
}
