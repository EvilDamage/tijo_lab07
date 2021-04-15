package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieMapper implements Converter <Movie, CreateMovieDto>  {

    @Override
    public Movie convert(CreateMovieDto createMovieDto) {
        Movie movie = new Movie.Builder()
                .videoId(createMovieDto.getVideoId())
                .image(createMovieDto.getImage())
                .title(createMovieDto.getTitle())
                .year(createMovieDto.getYear())
                .build();

        return movie;
    }

//    public Movie mapToEntity(CreateMovieDto createMovieDto) {
//        Movie movie = new Movie.Builder()
//                .videoId(createMovieDto.getVideoId())
//                .image(createMovieDto.getImage())
//                .title(createMovieDto.getTitle())
//                .year(createMovieDto.getYear())
//                .build() ;
//
////        movie.setImage(createMovieDto.getImage());
////        movie.setTitle(createMovieDto.getTitle());
////        movie.setYear(createMovieDto.getYear());
////        movie.setVideoId(createMovieDto.getVideoId());
//
//        return movie;
//    }

}
