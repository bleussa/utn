tinymce.init({
    selector: 'textarea',  // change this value according to your HTML
    file_picker_callback: (callback, value, meta) => {
      // Provide file and text for the link dialog
      if (meta.filetype == 'file') {
        callback('mypage.html', { text: 'My text' });
      }
  
      // Provide image and alt text for the image dialog
      if (meta.filetype == 'image') {
        callback('myimage.jpg', { alt: 'My alt text' });
      }
  
      // Provide alternative source and posted for the media dialog
      if (meta.filetype == 'media') {
        callback('movie.mp4', { source2: 'alt.ogg', poster: 'image.jpg' });
      }
    }
  });