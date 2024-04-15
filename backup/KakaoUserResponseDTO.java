


@Setter @Getter @ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class KakaoUserResponseDTO {

    private long id;

    @JsonProperty("connected_at")
    private LocalDateTime connecteAt;

    private Properties properties;


    public static class Properties{


        private string nickname;

        @JsonProperty("rofile_image")
        private String profileImage;

        @JsonProperty("thumbnail_image")
        private String thumbnailImage;






    }






}



















