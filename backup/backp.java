/*
package com.ictproject.moviemate.domain.movie.service;

import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class MovieService {


    // 인증 키
    String key = "8803352a1e880950e1e1d4a12c9c3186";

    // 파싱한 데이터 저장할 변수
    String result = "";




    try {
        // 영화 정보를 제공하는 웹 서비스에 접속할 URL 생성
        URL url = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieList.json?key="
                + key);

        // URL을 통해 데이터를 읽어오기 위한 BufferedReader 생성
        BufferedReader bf;

        // UTF-8 인코딩으로 데이터를 읽어오기 위해 InputStreamReader로 BufferedReader 초기화
        bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

        // 읽어온 데이터를 문자열로 저장
        result = bf.readLine();

        // JSON 데이터 파싱을 위한 JSONParser 객체 생성
        JSONParser jsonParser = new JSONParser();

        // JSON 데이터를 파싱하여 JSONObject로 변환
        JSONObject jsonObject = (JSONObject) jsonParser.parse(result);

        // JSON 데이터 출력
        System.out.println(jsonObject);

        // 주석 처리된 부분은 하드코딩된 JSON 데이터입니다. 실제로는 API 또는 외부에서 데이터를 가져와야 합니다.

        // JSON 데이터 문자열
        // String jsonData = "{\"movieListResult\":{\"totCnt\":98893,\"source\":\"영화진흥위원회\",\"movieList\":[{...}]}}";

        // JSON 데이터 파싱

        // JSON 데이터에서 "movieListResult" 필드를 추출
        JSONObject movieListResult = (JSONObject) jsonObject.get("movieListResult");

        // "movieListResult" 안에 있는 "movieList" 필드를 추출 (영화 목록)
        JSONArray movieList = (JSONArray) movieListResult.get("movieList");

        // 영화 목록을 순회하면서 데이터 출력
        for (Object movie : movieList) {
            JSONObject movieData = (JSONObject) movie;
            System.out.println("영화명(한글): " + movieData.get("movieNm"));
            System.out.println("영화명(영문): " + movieData.get("movieNmEn"));
            System.out.println("제작국가: " + movieData.get("nationAlt"));
            System.out.println("영화 장르: " + movieData.get("repGenreNm"));
            System.out.println("제작 연도: " + movieData.get("prdtYear"));
            System.out.println("영화 타입: " + movieData.get("typeNm"));
            // 필요한 다른 데이터도 출력 가능
            System.out.println("--------");
        }
    } catch(Exception e) {
        e.printStackTrace();
    }




}

 */