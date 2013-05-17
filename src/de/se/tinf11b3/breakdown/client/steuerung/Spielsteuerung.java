package de.se.tinf11b3.breakdown.client.steuerung;


import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.Random;

import de.se.tinf11b3.breakdown.client.ui.VCanvas;
import gwt.g2d.client.graphics.Color;
import gwt.g2d.client.graphics.DirectShapeRenderer;
import gwt.g2d.client.graphics.KnownColor;
import gwt.g2d.client.graphics.Surface;
import gwt.g2d.client.graphics.shapes.Shape;
import gwt.g2d.client.graphics.shapes.ShapeBuilder;
import gwt.g2d.client.math.Rectangle;
import gwt.g2d.client.math.Vector2;
import gwt.g2d.client.util.FpsTimer;

public class Spielsteuerung {

	private int mouseX;
	private int mouseY;
	private Surface surface;
	private DirectShapeRenderer shapeRenderer = new DirectShapeRenderer(surface);
//	private Particle p = new Particle(
//	new Vector2(Random.nextInt(VCanvas.WIDTH), Random.nextInt(VCanvas.HEIGHT)),
//	new Vector2(Math.random(), Math.random()).normalize(),
//	new Color(Random.nextInt(256),
//			Random.nextInt(256),
//			Random.nextInt(256),
//			1.0));
	
	
	public Spielsteuerung(final Surface surface) {
		this.surface = surface;
		
		surface.fillBackground(VCanvas.BACKGROUNDCOLOR).setFillStyle(KnownColor.ALICE_BLUE);
		
		surface.addMouseMoveHandler(new MouseMoveHandler() {
			public void onMouseMove(MouseMoveEvent event) {
				mouseX = event.getX();
				mouseY = event.getY();

				if(event.getX() <= 450 && event.getX() >= 50) {
					surface.setFillStyle(VCanvas.BACKGROUNDCOLOR);
					surface.setLineWidth(10);
					surface.fillShape(new ShapeBuilder().drawRect(new Rectangle(0, 460, 500, 100)).build());

					// Let the show begin!
					ShapeBuilder sb = new ShapeBuilder();
					sb.drawLineSegment(new Vector2(event.getX() - 50, 480), new Vector2(event.getX() + 50, 480));
					Shape shape = sb.build();
					surface.setStrokeStyle(KnownColor.BLACK);
					surface.strokeShape(shape);
					
				}

			}
		});

		surface.addMouseUpHandler(new MouseUpHandler() {
			public void onMouseUp(MouseUpEvent event) {
			}
		});

//		surface.addMouseDownHandler(new MouseDownHandler() {
//			public void onMouseDown(MouseDownEvent event) {
//				
////				for(int i=0; i<100; i++){
////					update();
////				}
//				
//				FpsTimer timer = new FpsTimer(100) {
//					
//					@Override
//					public void update() {
//						Vector2 pos = p.getPosition();
//					      Vector2 vel = p.getVelocity();
//					      if (pos.getX() < 0) {
//					        vel.setX(Math.abs(vel.getX()));
//					      } else if (pos.getX() >= VCanvas.WIDTH) {
//					        vel.setX(-Math.abs(vel.getX()));
//					      }
//					      if (pos.getY() < 0) {
//					        vel.setY(Math.abs(vel.getY()));
//					      } else if (pos.getY() >= VCanvas.HEIGHT) {
//					        vel.setY(-Math.abs(vel.getY()));
//					      }
//					      pos.mutableAdd(p.getVelocity());
//					    draw();
//					}
//				};
//				
//				timer.start();
//				
//			}
//		});
		
		
	}
	
	
//	public void update() {
//	      Vector2 pos = p.getPosition();
//	      Vector2 vel = p.getVelocity();
//	      if (pos.getX() < 0) {
//	        vel.setX(Math.abs(vel.getX()));
//	      } else if (pos.getX() >= VCanvas.WIDTH) {
//	        vel.setX(-Math.abs(vel.getX()));
//	      }
//	      if (pos.getY() < 0) {
//	        vel.setY(Math.abs(vel.getY()));
//	      } else if (pos.getY() >= VCanvas.HEIGHT) {
//	        vel.setY(-Math.abs(vel.getY()));
//	      }
//	      pos.mutableAdd(p.getVelocity());
//	      
//	      draw();
//	      
//	      
//	      //DRAW PADDLE
//	      surface.setFillStyle(KnownColor.CORNFLOWER_BLUE);
//			surface.fillShape(new ShapeBuilder().drawRect(new Rectangle(0, 460, 500, 100)).build());
//
//			// Let the show begin!
//			ShapeBuilder sb = new ShapeBuilder();
//			sb.drawLineSegment(new Vector2(this.mouseX - 50, 480), new Vector2(this.mouseX + 50, 480));
//			Shape shape = sb.build();
//			surface.setStrokeStyle(KnownColor.BLACK);
//			surface.strokeShape(shape);
//	      
//	      
//	      
//	      
//	  }
	  
	  /**
	   * Draws the particles.
	   */
//	  private void draw() {
//		  surface.clear().fillBackground(KnownColor.CORNFLOWER_BLUE);
//		  surface.save()
//	          .setFillStyle(p.getColor());
//	      shapeRenderer.beginPath()
//	              .moveTo(p.getPosition())
//	              .drawCircle(p.getPosition(), 10)
//	              .closePath()
//	              .fill();              
//	      surface.restore();
//	  }
	  
	  /**
	   * Simple particle class.
	   * 
	   * @author hao1300@gmail.com
	   */
//	  private static class Particle {
//	    private final Vector2 position, velocity;
//	    private final Color color;
//	    
//	    public Particle(Vector2 position, Vector2 velocity, Color color) {
//	      this.position = position;
//	      this.velocity = velocity;
//	      this.color = color;
//	    }
//	    
//	    public final Color getColor() {
//	      return color;
//	    }
//	    
//	    public final Vector2 getPosition() {
//	      return position;
//	    }
//	    
//	    public final Vector2 getVelocity() {
//	      return velocity;
//	    }
//	
//	  }
	
	

}
