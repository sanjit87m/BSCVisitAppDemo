//package org.bsc.com.bsc;
//
///**
// * Created by sanjit on 08/10/18.
// */
//
//
//import android.content.Context;
//import android.graphics.Typeface;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseExpandableListAdapter;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class FinalExpandableListAdapter extends BaseExpandableListAdapter {
//    private Context _context;
//    private ArrayList<Model.Categories> categoriesArrayList;
//
//    public FinalExpandableListAdapter(Context context, Model model) {
//        this._context = context;
//
//        this.categoriesArrayList = model.getCategories();
//    }
//
//    @Override
//    public Object getChild(int groupPosition, int childPosititon) {
//
//      return  categoriesArrayList.get(groupPosition).getSubcategories().get(childPosititon);
//    }
//
//    @Override
//    public long getChildId(int groupPosition, int childPosition) {
//        return childPosition;
//    }
//
//    @Override
//    public View getChildView(int groupPosition, final int childPosition,
//                             boolean isLastChild, View convertView, ViewGroup parent) {
//
//        final String childText = ((Model.Categories.Subcategories) getChild(groupPosition, childPosition)).getTitle();
//
//        if (convertView == null) {
//            LayoutInflater infalInflater = (LayoutInflater) this._context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = infalInflater.inflate(R.layout.list_item, null);
//        }
//
//        TextView txtListChild = (TextView) convertView
//                .findViewById(R.id.expandedListItem);
//
//        txtListChild.setText(childText);
//        return convertView;
//    }
//
//    @Override
//    public int getChildrenCount(int groupPosition) {
//        return categoriesArrayList.get(groupPosition).getSubcategories().size();
//    }
//
//    @Override
//    public Object getGroup(int groupPosition) {
//        return categoriesArrayList.get(groupPosition);
//    }
//
//    @Override
//    public int getGroupCount() {
//        return this.categoriesArrayList.size();
//    }
//
//    @Override
//    public long getGroupId(int groupPosition) {
//        return groupPosition;
//    }
//
//    @Override
//    public View getGroupView(int groupPosition, boolean isExpanded,
//                             View convertView, ViewGroup parent) {
//        String headerTitle = ((Model.Categories) getGroup(groupPosition)).getTitle();
//        if (convertView == null) {
//            LayoutInflater infalInflater = (LayoutInflater) this._context
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = infalInflater.inflate(R.layout.list_group, null);
//        }
//
//        TextView lblListHeader = (TextView) convertView
//                .findViewById(R.id.listTitle);
//        lblListHeader.setTypeface(null, Typeface.BOLD);
//        lblListHeader.setText(headerTitle);
//
//        return convertView;
//    }
//
//    @Override
//    public boolean hasStableIds() {
//        return false;
//    }
//
//    @Override
//    public boolean isChildSelectable(int groupPosition, int childPosition) {
//        return true;
//    }
//}