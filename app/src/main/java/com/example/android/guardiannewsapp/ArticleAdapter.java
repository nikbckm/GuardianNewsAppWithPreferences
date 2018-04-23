package com.example.android.guardiannewsapp;

/**
 * Created by NiklasBöckmann on 23.04.2018.
 */

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the article at the given position
     * in the list of articles.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.article_list_item, parent, false);
        }

        // Find the article at the given position in the list of articles
        Article currentArticle = getItem(position);
        String date = currentArticle.getDate();
        String author = currentArticle.getAuthor();
        String title = currentArticle.getTitle();

        TextView title_textview = (TextView) listItemView.findViewById(R.id.article_title);
        TextView author_textview = (TextView) listItemView.findViewById(R.id.article_author);
        TextView date_textview = (TextView) listItemView.findViewById(R.id.article_date);
        title_textview.setText(title);
        author_textview.setText(author);
        date_textview.setText(date);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
