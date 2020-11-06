package com.company;

public class apicall {
    public static void main(String[] args) {


        // Host url
        String host = "https://movie-database-imdb-alternative.p.rapidapi.com/";
        String charset = "UTF-8";
        // Headers for a request
        String x_rapidapi_host = "movie-database-imdb-alternative.p.rapidapi.com";
        String x_rapidapi_key = <YOUR_RAPIDAPI_KEY>;//Type here your key
        // Params
        String s = "Pulp";
        // Format query for preventing encoding problems
        String query = String.format("s=%s",
                URLEncoder.encode(s, charset));



        HttpResponse <JsonNode> response = Unirest.get(host + "?" + query)
                .header("x-rapidapi-host", x_rapidapi_host)
                .header("x-rapidapi-key", x_rapidapi_key)
                .asJson();
        System.out.println(response.getStatus());
        System.out.println(response.getHeaders().get("Content-Type"));
    }


}
